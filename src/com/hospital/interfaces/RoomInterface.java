package com.hospital.interfaces;

import java.util.List;

import com.hospital.models.Room;

public interface RoomInterface {
	public void affichage(Room r);
	public Room getOne(int number, List<Room> rooms);
	public void affichages(List<Room> rooms);
}
