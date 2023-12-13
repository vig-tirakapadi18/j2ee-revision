package manyToManyEx;

import java.util.*;
import javax.persistence.*;

@Entity
public class SocialMedia {
        @Id
        int sId;
        String sName;

        @ManyToMany
        List<User> uList;

        public SocialMedia() {
                super();
        }

        public SocialMedia(int sId, String sName, List<User> uList) {
                super();
                this.sId = sId;
                this.sName = sName;
                this.uList = uList;
        }

        public int getsId() {
                return sId;
        }

        public void setsId(int sId) {
                this.sId = sId;
        }

        public String getsName() {
                return sName;
        }

        public void setsName(String sName) {
                this.sName = sName;
        }

        public List<User> getuList() {
                return uList;
        }

        public void setuList(List<User> uList) {
                this.uList = uList;
        }

        @Override
        public String toString() {
                return "SocialMedia [sId=" + sId + ", sName=" + sName + ", uList=" + uList + "]";
        }
}
