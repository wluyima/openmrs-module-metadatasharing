/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.metadatasharing.downloader.impl;

import java.util.HashMap;

import org.openmrs.module.metadatasharing.downloader.Downloader;
import org.openmrs.module.metadatasharing.downloader.DownloaderFactory;
import org.openmrs.module.metadatasharing.downloader.DownloaderFactoryTest;

/**
 * Test for {@link DownloaderFactoryImpl} implementation of {@link DownloaderFactory}
 * 
 * @see DownloaderFactoryTest
 */
public class DownloaderFactoryImplTest extends DownloaderFactoryTest {
	
	/**
	 * @see org.openmrs.module.metadatasharing.downloader.DownloaderFactoryTest#getDownloaderFactory(java.lang.String[])
	 */
	@Override
	protected DownloaderFactory getDownloaderFactory(String... protocols) {
		DownloaderFactoryImpl factory = new DownloaderFactoryImpl();
		HashMap<String, Class<? extends Downloader>> map = new HashMap<String, Class<? extends Downloader>>();
		for (String protocol : protocols) {
			map.put(protocol, MockDownloader.class);
		}
		factory.setDownloaders(map);
		return factory;
	}
}
