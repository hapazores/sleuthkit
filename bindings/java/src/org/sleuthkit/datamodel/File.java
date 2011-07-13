/*
 * Sleuth Kit Data Model
 *
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sleuthkit.datamodel;


/**
 *
 * @author alawrence
 */
public class File extends FsContent{

	//constructor used for getfile from tskDb
	/**
	 * Constructor most fields are from the database
	 * @param db java database class
	 * @param fs_id
	 * @param file_id
	 * @param attr_type
	 * @param attr_id
	 * @param name
	 * @param par_file_id
	 * @param dir_type
	 * @param meta_type
	 * @param dir_flags
	 * @param meta_flags
	 * @param size
	 * @param ctime
	 * @param crtime
	 * @param atime
	 * @param mtime
	 * @param mode
	 * @param uid
	 * @param gid
	 */
	protected File(Sleuthkit db, long fs_id, long file_id, long attr_type, long attr_id, String name, long par_file_id,
			long dir_type, long meta_type, long dir_flags, long meta_flags, long size, 
			long ctime, long crtime, long atime, long mtime, long mode, long uid, long gid){
		this.db = db;
		this.fs_id = fs_id;
		this.file_id = file_id;
		this.attr_type = attr_type;
		this.attr_id = attr_id;
		this.name = name;
		this.par_file_id = par_file_id;
		this.dir_type = dir_type;
		this.meta_type = meta_type;
		this.dir_flags = dir_flags;
		this.meta_flags = meta_flags;
		this.size = size;
		this.ctime = ctime;
		this.crtime = crtime;
		this.atime = atime;
		this.mtime = mtime;
		this.mode = mode;
		this.uid = uid;
		this.gid = gid;
	}

	/**
	 * is this a file?
	 * @return true, it is a file
	 */
	public boolean isFile(){
		return true;
	}


}

