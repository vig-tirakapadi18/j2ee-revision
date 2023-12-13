package oneToManyEx;

import javax.persistence.*;

@Entity
public class Product {
        @Id
        int pId;
        String pName;
        int pPrice;

        @ManyToOne
        Customer cust;

        public Product() {
                super();
        }

        public Product(int pId, String pName, int pPrice, Customer cust) {
                this.pId = pId;
                this.pName = pName;
                this.pPrice = pPrice;
                this.cust = cust;
        }

        public int getpId() {
                return pId;
        }

        public void setpId(int pId) {
                this.pId = pId;
        }

        public String getpName() {
                return pName;
        }

        public void setpName(String pName) {
                this.pName = pName;
        }

        public int getpPrice() {
                return pPrice;
        }

        public void setpPrice(int pPrice) {
                this.pPrice = pPrice;
        }

        public Customer getCust() {
                return cust;
        }

        public void setCust(Customer cust) {
                this.cust = cust;
        }

        @Override
        public String toString() {
                return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", cust=" + cust + "]";
        }
}
