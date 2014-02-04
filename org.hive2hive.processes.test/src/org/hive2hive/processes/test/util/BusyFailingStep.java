package org.hive2hive.processes.test.util;

import org.hive2hive.processes.framework.exceptions.InvalidProcessStateException;

public class BusyFailingStep extends FailingProcessStep {

	@Override
	protected void doExecute() throws InvalidProcessStateException {
		
		// super busy
		TestUtil.wait(10000);

		super.doExecute();
	}
}
