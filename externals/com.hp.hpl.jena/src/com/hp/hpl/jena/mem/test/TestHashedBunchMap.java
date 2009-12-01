/*
 	(c) Copyright 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
 	All rights reserved.
 	$Id: TestHashedBunchMap.java,v 1.7 2009/03/18 10:36:35 chris-dollin Exp $
*/

package com.hp.hpl.jena.mem.test;

import com.hp.hpl.jena.mem.*;
import com.hp.hpl.jena.rdf.model.test.ModelTestBase;

public class TestHashedBunchMap extends ModelTestBase
    { // TODO should extend this a lot
    public TestHashedBunchMap( String name )
        { super( name ); }
    
    public void testSize()
        {
        HashCommon<Object> b = new HashedBunchMap();
        }

    public void testClearSetsSizeToZero()
        {
        TripleBunch a = new ArrayBunch();
        HashedBunchMap b = new HashedBunchMap();
        b.clear();
        assertEquals( 0, b.size() );
        b.put( "key",  a );
        assertEquals( 1, b.size() );
        b.clear();
        assertEquals( 0, b.size() );
        }
    }

/*
 * (c) Copyright 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/