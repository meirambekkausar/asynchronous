package task2;

import task1.ContentItem;
import task1.Downloadable;
import task1.PodcastEpisode;
import task1.VideoLecture;

import java.util.ArrayList;
import java.time.Year;

public class ContentDemo {
    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2023, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2021, 120, "4K"));
        items.add(new PodcastEpisode("Tech Talks", 2024, 45, "Alice"));
        items.add(new PodcastEpisode("Code Stories", 2022, 60, "Bob"));

        int currentYear = Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item);
            System.out.println("License cost: " +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " +
                        d.getMaxDownloadsPerDay());
            }

            System.out.println("------");
        }
    }
}

