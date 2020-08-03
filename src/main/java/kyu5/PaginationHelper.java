package kyu5;
// Instructions at https://www.codewars.com/kata/515bb423de843ea99400000a/train/java

import java.util.List;

public class PaginationHelper<I> {

    private final List<I> collection;
    private final int pageSize;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.pageSize = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (this.collection.size() / this.pageSize) + (this.collection.size() % this.pageSize > 0 ? 1 : 0);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= this.pageCount()) {
            return -1;
        } else if (pageIndex != this.pageCount() - 1) {
            return this.pageSize;
        } else {
            return (this.collection.size() % this.pageSize);
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > this.collection.size() - 1) {
            return -1;
        } else if (itemIndex != 0){
            return (itemIndex / this.pageSize) + (itemIndex % this.pageSize > 0 ? 1 : 0) - 1;
        } else {
            return 0;
        }
    }
}
