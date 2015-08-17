/**
    Main program for jbhasher (JBoss Hasher)
    
    Copyright (C) 2015
    Joseba Martos <joseba@otzarri.net>
    Based on "How to generate JBossAS7 encrypted passwords programatically"
    article in Middleware Magic: middlewaremagic.com/jboss/?p=2206
    
    This file is part of jbhasher (JBoss Hasher)
    Web site: http://otzarri.net/jbhasher
    
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package net.otzarri.jbhasher;

import org.jboss.crypto.CryptoUtil;

public class Hasher {
    public static void main(String args[]) throws Exception {
       String realmName=args[0];
       String userName=args[1];
       String password=args[2];

       String clearTextPassword=userName+":"+realmName+":"+password;
       String hashedPassword=CryptoUtil.createPasswordHash("MD5", "hex", null, null, clearTextPassword);

       System.out.println(userName+'='+hashedPassword);
     }
  }