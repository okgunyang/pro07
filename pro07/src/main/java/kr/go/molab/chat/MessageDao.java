package kr.go.molab.chat;

import java.util.List;

public interface MessageDao {
 
    public String countMessageView(String user_id);
    public List<MessageVO> findList(String receiver_name);
    public void insertMessage(MessageVO messageVO);
}