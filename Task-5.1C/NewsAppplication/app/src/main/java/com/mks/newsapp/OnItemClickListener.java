package com.mks.newsapp;

import java.util.List;

public interface OnItemClickListener {
    void onItemClick(News news, List<News> relatedNews);
}
