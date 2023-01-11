package kr.go.molab.chat;

import java.util.List;

public interface MessageService {
	public List<MessageVO> findList(String receiver_name);
	public void insertMessage(MessageVO messageVO);
}
