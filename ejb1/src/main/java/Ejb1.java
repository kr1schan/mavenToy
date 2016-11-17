import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Startup
@Singleton
public class Ejb1
{

	@PostConstruct
	public void foo()
	{
	}
}
