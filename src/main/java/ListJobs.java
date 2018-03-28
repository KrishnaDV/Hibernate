
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListJobs {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure(); // loads hibernate.cfg.xml

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Job");

		List<Job> lj = q.list();
		for (Job j : lj) {
			System.out.println(j.getTitle());
		}

		s.close();
		sf.close();
	}

}
