package org.dao;

import org.bean.Question;
import org.bean.Tag;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.SessionUtil;

public class QuestionDao {

    public void save(Question domain) {
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(domain);
        transaction.commit();
        session.close();
    }
    public Question find(Integer id){
        Session session = SessionUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Question question=session.get(Question.class,id);
        transaction.commit();
        session.close();
        return question;
    }


}
