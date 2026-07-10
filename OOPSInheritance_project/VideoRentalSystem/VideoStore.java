package OOPSInheritance_project.VideoRentalSystem;
public class VideoStore {
    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[100];
        count = 0;
    }

    public void addVideo(String name) {
        store[count] = new Video(name);
        count++;
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                if (store[i].getCheckout()) {
                    System.out.println("Video \"" + name + "\" is already checked out.");
                } else {
                    store[i].doCheckout();
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                if (!store[i].getCheckout()) {
                    System.out.println("Video \"" + name + "\" is already available.");
                } else {
                    store[i].doReturn();
                    System.out.println("Video \"" + name + "\" returned successfully.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                if (rating >= 1 && rating <= 10) {
                    store[i].receiveRating(rating);
                    System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                } else {
                    System.out.println("Rating should be between 1 and 10.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-20s | %-20s | %-10s%n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s | %-20s | %-10d%n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }
    }
}