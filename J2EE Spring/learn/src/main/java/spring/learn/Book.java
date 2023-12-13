package spring.learn;

import java.util.*;

public class Book {
        List<Integer> pages;
        Set<String> types;
        Map<String, String> bookInfo;

        public Book() {
                super();
        }

        public Book(List<Integer> pages, Set<String> types, Map<String, String> bookInfo) {
                super();
                this.pages = pages;
                this.types = types;
                this.bookInfo = bookInfo;
        }

        public List<Integer> getPages() {
                return pages;
        }

        public void setPages(List<Integer> pages) {
                this.pages = pages;
        }

        public Set<String> getTypes() {
                return types;
        }

        public void setTypes(Set<String> types) {
                this.types = types;
        }

        public Map<String, String> getBookInfo() {
                return bookInfo;
        }

        public void setBookInfo(Map<String, String> bookInfo) {
                this.bookInfo = bookInfo;
        }

        @Override
        public String toString() {
                return "Book [pages=" + pages + ", types=" + types + ", bookInfo=" + bookInfo + "]";
        }
}
