package com.sansumbrella;

import processing.app.Editor;
import processing.app.tools.Tool;

public class ObliqueTool implements Tool  {
	
	private static final long serialVersionUID = 1L;
	private Editor editor;
	private StrategyList strategies;
	
	public void init(Editor editor)
	{
		this.editor = editor;
		strategies = new StrategyList();
	}
	
	public void run()
	{
		editor.statusNotice( strategies.nextStrategy() );
	}
	
	public String getMenuTitle()
	{
		return "Oblique Strategies";
	}
}
