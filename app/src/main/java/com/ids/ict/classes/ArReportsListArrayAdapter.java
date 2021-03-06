package com.ids.ict.classes;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ids.ict.R;
import com.ids.ict.TCTDbAdapter;
import com.ids.ict.R.drawable;


public class ArReportsListArrayAdapter  extends ArrayAdapter<Mail_OFF> {
	private final Activity context;
	private final Mail_OFF[] events;
	com.ids.ict.MyApplication app;
	public ArReportsListArrayAdapter(Activity context, Mail_OFF[] newEvents) {
		super(context, com.ids.ict.R.layout.arreportslist_item,newEvents );
		this.context = context;
		this.events = newEvents;
	//	app=(MyApplication) context.getApplicationContext();
	}
	// static to save the reference to the outer class and to avoid access to
	// any members of the containing class

	static class ViewHolder {
		public TextView titleTextView;
		public String thumbnailUrl;
		public ImageView imageView;
		public TextView bodyTextView;
	//	public TextView dateTextView;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// ViewHolder will buffer the assess to the individual fields of the row layout
		ViewHolder holder;
		// Recycle existing view if passed as parameter
		// This will save memory and time on Android
		// This only works if the base layout for all classes are the same
		View rowView = convertView;
		// code for latest news feed
		Log.d("position",""+position);
		if (rowView == null) {
				LayoutInflater inflater = context.getLayoutInflater();
				rowView = inflater.inflate(R.layout.arreportslist_item, null, true);
				holder = new ViewHolder();
				holder.titleTextView = (TextView) rowView.findViewById(R.id.title_textView_rep);
				ViewResizing.textResize(context, holder.titleTextView,(int) holder.titleTextView.getTextSize());
				holder.bodyTextView=(TextView)rowView.findViewById(R.id.description_textView_rep);
				ViewResizing.textResize(context, holder.bodyTextView,(int) holder.bodyTextView.getTextSize());
				holder.imageView=(ImageView)rowView.findViewById(R.id.news_bullet);
			//	holder.dateTextView= (TextView)rowView.findViewById(R.id.date_textView_rep);
			//	ViewResizing.textResize(context, holder.dateTextView,(int) holder.dateTextView.getTextSize());
				rowView.setTag(holder);
			} else {
				holder = (ViewHolder) rowView.getTag();
			}
			holder.titleTextView.setText(events[position].getdate_aff());
			//String text  = events[position].getDate();
		//	if(!events[position].getLocation().equals("")) text = events[position].getLocation()+ "   " + text;
		//	holder.dateTextView.setText(text);
		//	holder.thumbnailUrl=events[position].getThumbnailUrl();
			if(events[position].getstatus().equals("sended")){
				holder.imageView.setImageResource(drawable.greenmark);
			}else {
				holder.imageView.setImageResource(drawable.redcircle);
			}
			if(events[position].getlang().equals("English")){
				TCTDbAdapter source = new TCTDbAdapter(context);
				source.open();
				
				String eng_name = source.getissue_det_name_ar(""+events[position].getissueid());
				holder.bodyTextView.setText(eng_name + " ???? " + events[position].getloc());
				source.close();
			}else{
			holder.bodyTextView.setText(events[position].getissuename() + " ???? " + events[position].getloc());
			}
			
			
		return rowView;
	}
	
	
	
	   
}
