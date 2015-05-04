/* 
* SessionApplication.java
* 
* Copyright (c) 2015 Noterik B.V.
* 
* This file is part of Lou, related to the Noterik Springfield project.
*
* Lou is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Lou is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Lou.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.springfield.lou.application.types;

import org.springfield.lou.application.Html5Application;
import org.springfield.lou.screen.Screen;

public class SessionexampleApplication extends Html5Application{
	
	public SessionexampleApplication(String id) {
		super(id); 
		
		this.setSessionRecovery(true);
		this.addToRecoveryList("query");
	}
	
	public void onNewScreen(Screen s){
		System.out.println("SessionexampleApplication.onNewScreen()");
		
		this.loadContent(s, "queryinput", "queryinput");
		s.setDiv("query", "bind:change", "actionQueryformchange", this);
		if(s.getProperty("query") != null){
			updateQueryVal(s);
		}
	}

	public void actionQueryformchange(Screen s, String c){
		s.setProperty("query", c);
		updateQueryVal(s);
	}
	
	private void updateQueryVal(Screen s){
		s.setContent("queryval", (String) s.getProperty("query"));
	}
	
}
