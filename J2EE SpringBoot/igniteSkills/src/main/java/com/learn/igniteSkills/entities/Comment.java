package com.learn.igniteSkills.entities;

import jakarta.persistence.*;

@Entity
public class Comment {
        @Id
        int commentId;
        String commentMsg;

        public Comment() {
                super();
        }

        public Comment(int commentId, String commentMsg) {
                super();
                this.commentId = commentId;
                this.commentMsg = commentMsg;
        }

        public int getCommentId() {
                return commentId;
        }

        public void setCommentId(int commentId) {
                this.commentId = commentId;
        }

        public String getCommentMsg() {
                return commentMsg;
        }

        public void setCommentMsg(String commentMsg) {
                this.commentMsg = commentMsg;
        }

        @Override
        public String toString() {
                return "Comment [commentId=" + commentId + ", commentMsg=" + commentMsg + "]";
        }
}
