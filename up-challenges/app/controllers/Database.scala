package controllers

import java.sql.DriverManager
import scala.util.Try
import org.hibernate.SessionFactory
import org.hibernate.boot.registry.StandardServiceRegistryBuilder
import org.hibernate.cfg.Configuration
import org.hibernate.Session
import dto.database.User
import org.hibernate.criterion.Restrictions

object Database {
	Try(Class.forName("com.microsoft.sqlserver.jdbc4.SQLServerDriver"));
	private val ConnectionString = "jdbc:sqlserver://o6c14dgq1e.database.windows.net:1433;database=up-challenges;user=adminuser@o6c14dgq1e;password=TV49q3g2wun6Kh9;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

	val Connection = DriverManager.getConnection(ConnectionString);


	def userExists(xid: String): Boolean = {
			val session: Session = HibernateService.getCurrentSession(true);
	val criteria = session.createCriteria(classOf[User]).add(Restrictions.eq("jawbonehash", xid));
	val result = criteria.uniqueResult().asInstanceOf[User];
	Option(result).isDefined;
	}
	val SessionFactory: SessionFactory = {
			val configuration = new Configuration()
			//		.configure()
			//		.setProperty("hibernate.connection.url", DatabaseCredentials.Url)
			//		.setProperty("hibernate.connection.username", DatabaseCredentials.Username)
			//		.setProperty("hibernate.connection.password", DatabaseCredentials.Password);
			val builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
			val factory = configuration.buildSessionFactory(builder.build());
			factory;
	}
	val HibernateService = new HibernateService(SessionFactory);
}