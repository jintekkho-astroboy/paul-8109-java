public class Book {
        // A class can have attributes
            // All objects create from the class will have those attributes
                private String title;
                    private String author;
                        private int numberOfPages;

                            // default constructor: without parameters
                                // set the default values for each of the properties
                                    public Book() {
                                            title = "Untitled";
                                                    author = "Unknown Author";
                                                            numberOfPages = 1;
                                                                }

                                                                    // overloaded constructor: with parameters
                                                                        public Book(String title, String author, int numberOfPages) {
                                                                                setTitle(title);
                                                                                        setAuthor(author);
                                                                                                setNumberOfPages(numberOfPages);
                                                                                                    }

                                                                                                        public String getTitle() {
                                                                                                                return title;
                                                                                                                    }

                                                                                                                        public String getAuthor() {
                                                                                                                                return author;
                                                                                                                                    }

                                                                                                                                        public int getNumberOfPages() {
                                                                                                                                                return numberOfPages;
                                                                                                                                                    }

                                                                                                                                                        public void setTitle(String newTitle) {
                                                                                                                                                                if (newTitle.length() >= 0 && newTitle.length() <= 100) {
                                                                                                                                                                            title = newTitle;
                                                                                                                                                                                    }
                                                                                                                                                                                        }

                                                                                                                                                                                            public void setAuthor(String newAuthor) {
                                                                                                                                                                                                    if (newAuthor.length() >= 0 && newAuthor.length() <= 100) {
                                                                                                                                                                                                                author = newAuthor;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                public void setNumberOfPages(int numberOfPages) {
                                                                                                                                                                                                                                        if (numberOfPages > 0) {
                                                                                                                                                                                                                                                    this.numberOfPages = numberOfPages;
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                    // call automatically if we need a String
                                                                                                                                                                                                                                                                        // representation of the object
                                                                                                                                                                                                                                                                            public String toString() {
                                                                                                                                                                                                                                                                                    String template = "%s by %s (%d pages)";
                                                                                                                                                                                                                                                                                            return String.format(template, getTitle(), getAuthor(), getNumberOfPages() );
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                
}