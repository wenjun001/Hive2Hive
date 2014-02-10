package org.hive2hive.core.processes.implementations.share;

import net.tomp2p.peers.PeerAddress;

import org.hive2hive.core.model.FolderIndex;
import org.hive2hive.core.network.messages.direct.BaseDirectMessage;
import org.hive2hive.core.network.userprofiletask.UserProfileTask;
import org.hive2hive.core.processes.implementations.notify.BaseNotificationMessageFactory;

public class ShareFolderNotificationMessageFactory extends BaseNotificationMessageFactory {

	private final FolderIndex fileNode;

	public ShareFolderNotificationMessageFactory(FolderIndex fileNode) {
		this.fileNode = fileNode;
	}

	@Override
	public BaseDirectMessage createPrivateNotificationMessage(PeerAddress receiver) {
		// own clients must not be notified
		return null;
	}

	@Override
	public UserProfileTask createUserProfileTask() {
		return new ShareFolderUserProfileTask(fileNode);
	}
}
