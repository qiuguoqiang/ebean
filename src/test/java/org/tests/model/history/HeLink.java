package org.tests.model.history;

import io.ebean.annotation.History;
import io.ebean.annotation.HistoryExclude;
import org.tests.model.draftable.BaseDomain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@History
@Entity
public class HeLink extends BaseDomain {

  String name;

  String location;

  String comments;

  @HistoryExclude
  @ManyToMany
  List<HeDoc> docs;

  public HeLink(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public HeLink() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public List<HeDoc> getDocs() {
    return docs;
  }

  public void setDocs(List<HeDoc> docs) {
    this.docs = docs;
  }
}
