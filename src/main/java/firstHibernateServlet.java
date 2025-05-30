import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@WebServlet("/firstHibernateServlet")
public class firstHibernateServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		String username= req.getParameter("username");
		
		dataSave save =new dataSave();
		save.setUsername(username);
		
		Configuration conf=new Configuration().addAnnotatedClass(dataSave.class).configure();
		SessionFactory sessionFactory= conf.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(save);
		session.getTransaction().commit();
	}
	
}
