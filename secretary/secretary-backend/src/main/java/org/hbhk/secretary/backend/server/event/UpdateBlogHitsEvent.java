package org.hbhk.secretary.backend.server.event;

import org.springframework.context.ApplicationEvent;

public class UpdateBlogHitsEvent extends ApplicationEvent {

	private static final long serialVersionUID = -9081512685323297050L;
	private String blogId;

	public UpdateBlogHitsEvent(String blogId) {
		super(blogId);

	}

	public void updateBlogHit() {
	}

	public String getBlogId() {
		return blogId;
	}

}
