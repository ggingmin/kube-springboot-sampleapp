package com.ggingmin.waitinglist.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection="guests")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

        @Transient
        public static final String SEQUENCE_NAME = "guests_sequence";

        @Id
        private ObjectId _id;
        private Long id;
        private String content;
        @CreatedDate
        private LocalDateTime createdAt;


        public  Guest(String content, LocalDateTime createdAt) {
                this.content = content;
                this.createdAt = createdAt;
        }


        @Override
        public String toString() {
                return content;
        }
}
