package dao;

import java.util.List;

import model.Meeting;

public interface MeetingDao {
	public int insertMeeting(Meeting m);
	public List<Meeting> selectAllMeetings();
	public Meeting selectMeetingById(int id);
	public void updateMeeting(Meeting change);
	public void deleteMeetingById(int id);
}
