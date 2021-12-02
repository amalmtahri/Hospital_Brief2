package com.hospital.Impl;

import java.util.List;

import com.hospital.interfaces.RoomInterface;
import com.hospital.models.Room;

public class RoomImpl implements RoomInterface{

	@Override
	public void affichage(Room r) {
		// TODO Auto-generated method stub
		System.out.println("_________________________________________________________");
		System.out.println("Number of Room :" + r.getNumber());
		System.out.println("Stage of Room:" + r.getNumber());
		System.out.println("_________________________________________________________");
	}

	@Override
	public Room getOne(int number, List<Room> rooms) {
		// TODO Auto-generated method stub
		for (Room room : rooms) {
			if(room.getNumber() == number) {
				return room;
			}
		}
		return null;
	}

	@Override
	public void affichages(List<Room> rooms) {
		// TODO Auto-generated method stub
		for (Room room : rooms) {
			affichage(room);
		}
		
	}

}
