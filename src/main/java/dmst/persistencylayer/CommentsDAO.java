/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmst.persistencylayer;

import java.util.List;
import javabeans.CommentBean;
import dmst.transferobjects.CommentsTO;


public interface CommentsDAO {
    
    public List<CommentBean> get(int ID);
    public boolean like(int ID);
    public boolean dislike(int ID);
    public boolean delete(int ID);
    public boolean comment(CommentsTO commentsTO);
    public boolean commentTo(CommentsTO commentsTO);
    
}
