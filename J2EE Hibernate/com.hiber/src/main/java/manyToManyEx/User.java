package manyToManyEx;

import java.util.*;
import javax.persistence.*;

@Entity
public class User {
        @Id
        int uId;
        String uName;

        @ManyToMany
        List<SocialMedia> sList;

        public User() {
                super();
        }

        public User(int uId, String uName, List<SocialMedia> sList) {
                super();
                this.uId = uId;
                this.uName = uName;
                this.sList = sList;
        }

        public int getuId() {
                return uId;
        }

        public void setuId(int uId) {
                this.uId = uId;
        }

        public String getuName() {
                return uName;
        }

        public void setuName(String uName) {
                this.uName = uName;
        }

        public List<SocialMedia> getsList() {
                return sList;
        }

        public void setsList(List<SocialMedia> sList) {
                this.sList = sList;
        }

        @Override
        public String toString() {
                return "User [uId=" + uId + ", uName=" + uName + ", sList=" + sList + "]";
        }
}
