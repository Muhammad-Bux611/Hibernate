import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dataSave {
	
	@Id
String username;
	
	public void setUsername(String username) {
		this.username=username;
		
	}
	
	public String getUsername() {
		return username;
	}

}
