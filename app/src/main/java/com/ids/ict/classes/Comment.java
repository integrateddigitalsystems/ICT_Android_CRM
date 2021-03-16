package com.ids.ict.classes;

public class Comment {
	private String message;
	private String username;
	private String creationDate;
	boolean isEdittext = false;
	private String isUser;
	private String fileName = "";
	private String imageUrl = "";
	private String isAdmin;
	private int[] arrayImage;

	public Comment() {
	}

	public Comment(String message, String username, String creationDate, boolean isEdittext, String isUser, String fileName, String imageUrl, String isAdmin) {
		this.message = message;
		this.username = username;
		this.creationDate = creationDate;
		this.isEdittext = isEdittext;
		this.isUser = isUser;
		this.fileName = fileName;
		this.imageUrl = imageUrl;
		this.isAdmin = isAdmin;
	}
	public Comment(String message, String username, String creationDate, boolean isEdittext, String isUser, String fileName, String imageUrl, String isAdmin,int[] array) {
		this.message = message;
		this.username = username;
		this.creationDate = creationDate;
		this.isEdittext = isEdittext;
		this.isUser = isUser;
		this.fileName = fileName;
		this.imageUrl = imageUrl;
		this.isAdmin = isAdmin;
		this.arrayImage=array;
	}
	public int[] getArrayImage() {
		return arrayImage;
	}

	public void setArrayImage(int[] arrayImage) {
		this.arrayImage = arrayImage;
	}

	public void setIsUser(String is) {
		this.isUser = is;
	}

	public String getIsUser() {
		return isUser;
	}

	public void setIsAdmin(String admin) {
		this.isAdmin = admin;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsEditText(boolean b) {
		this.isEdittext = b;
	}

	public boolean getIsEditText() {
		return isEdittext;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFileName() {
		// TODO Auto-generated method stub
		return fileName;
	}

	public void setFileName(String file) {
		this.fileName = file;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String url) {
		this.imageUrl = url;
	}
}
