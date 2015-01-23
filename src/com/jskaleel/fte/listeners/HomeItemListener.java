package com.jskaleel.fte.listeners;

import com.jskaleel.fte.home.BooksHomeListItems;

import android.view.View;

public interface HomeItemListener {
	public void DownloadPressed(BooksHomeListItems singleItem);
	public void OpenPressed(BooksHomeListItems singleItem);
}
