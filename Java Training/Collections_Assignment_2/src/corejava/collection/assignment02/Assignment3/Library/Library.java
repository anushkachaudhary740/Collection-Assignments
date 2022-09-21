package corejava.collection.assignment02.Assignment3.Library;

public class Library {
        private String productName;
        private String libraryName;
        private int version;
        public Library(String productName, String libraryName, String version) {
            this.productName = productName;
            this.libraryName = libraryName;
            this.version = Integer.parseInt(version.substring(1));
        }
        public String getProductName() {
            return productName;
        }
        public void setProductName(String productName) {
            this.productName = productName;
        }
        public String getLibraryName() {
            return libraryName;
        }
        public void setLibraryName(String libraryName) {
            this.libraryName = libraryName;
        }
        public int getVersion() {
            return version;
        }
        public void setVersion(String version) {
            this.version = Integer.parseInt(version.substring(1));
        }
}
