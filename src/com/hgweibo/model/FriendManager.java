package com.hgweibo.model;

public class FriendManager {

	private int listId;
	private Integer usersId;
	private Integer friendId;
	private String friendsNick;
	private String sortFriend;

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public Integer getUsersId() {
		return usersId;
	}

	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	public Integer getFriendId() {
		return friendId;
	}

	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}

	public String getFriendsNick() {
		return friendsNick;
	}

	public void setFriendsNick(String friendsNick) {
		this.friendsNick = friendsNick;
	}

	public String getSortFriend() {
		return sortFriend;
	}

	public void setSortFriend(String sortFriend) {
		this.sortFriend = sortFriend;
	}

}
