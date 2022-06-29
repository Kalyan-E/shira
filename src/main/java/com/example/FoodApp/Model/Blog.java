package com.example.FoodApp.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Blogs")
public class Blog {
        @Id
        private int id;
        private String title;
        private String description;
        private String category;
        private Location location;
        private String file;

        public Blog(int id, String title, String description, String category, Location location, String file) {
                this.id = id;
                this.title = title;
                this.description = description;
                this.category = category;
                this.location = location;
                this.file = file;
        }

}
