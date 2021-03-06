package webdev.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
  @Id
  private int id;
  private String title;
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;
  @Temporal(TemporalType.TIMESTAMP)
  private Date modified;
  @JsonIgnore
  @OneToMany(mappedBy="course")
  private List<Module> modules;
  
  public int getId() {
	  return this.id;
  }
  
  public String getTitle() {
	return title;
	}
	
  public void setTitle(String title) {
		this.title = title;
  }
	
  public Date getCreated() {
	  return created;
  }
	
  public void setCreated(Date created) {
	  this.created = created;
  }
	
  public Date getModified() {
	  return modified;
  }
	
  public void setModified(Date modified) {
	  this.modified = modified;
  }
	
  public void setModules(List<Module> modules) {
	  this.modules = modules;
  }

  public List<Module> getModules() {
	  return this.modules;
  }
}
