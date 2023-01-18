package de.academy.training.devops.webblog.persistence;

public class DataStore {

    private Map<Integer, Post> postMap;
    private int nextPostId = 1;

    public DataStore() {
        postMap = new HashMap<>();
    }

    public void addPost(Post post) {
        postMap.put(nextPostId, post);
        nextPostId++;
    }

    public Post getPost(int id) {
        return postMap.get(id);
    }
}
