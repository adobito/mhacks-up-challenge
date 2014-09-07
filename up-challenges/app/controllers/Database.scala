package controllers

import java.sql.DriverManager
import scala.util.Try
import org.hibernate.SessionFactory
import org.hibernate.boot.registry.StandardServiceRegistryBuilder
import org.hibernate.cfg.Configuration

object Database {
//	Try(Class.forName("com.microsoft.sqlserver.jdbc4.SQLServerDriver"));
//	private val ConnectionString = "jdbc:sqlserver://o6c14dgq1e.database.windows.net:1433;database=up-challenges;user=adminuser@o6c14dgq1e;password=TV49q3g2wun6Kh9;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
//	
//	val Connection = DriverManager.getConnection(ConnectionString);

	
//	def userExists(xid: String): Boolean = {
//	  val statement = Connection.prepareStatement("SELECT * FROM users u WHERE u.jawbonehash = " + xid);
//	  statement.executeQuery().next();
//	}
val SessionFactory: SessionFactory = {
		val configuration = new Configuration()
		.configure()
		.setProperty("hibernate.connection.url", "jdbc:mysql://138.91.112.52/up-challenges")
		.setProperty("hibernate.connection.username", "root")
		.setProperty("hibernate.connection.password", "");
		val builder = new StandardServiceRegistryBuilder()
		.applySettings(configuration.getProperties());
		val factory = configuration.buildSessionFactory(builder.build());
		factory;
}
	val HibernateService = new HibernateService(SessionFactory);
}