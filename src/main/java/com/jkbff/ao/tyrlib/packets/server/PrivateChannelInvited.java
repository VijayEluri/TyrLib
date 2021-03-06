package com.jkbff.ao.tyrlib.packets.server;

import java.io.DataInputStream;
import java.io.IOException;

import sk.sigp.aobot.client.types.AbstractType;
import sk.sigp.aobot.client.types.CharacterId;

public class PrivateChannelInvited extends BaseServerPacket {

	public static final int TYPE = 50;

	protected final CharacterId privateChannelId;

	public PrivateChannelInvited(DataInputStream input) {
		this.privateChannelId = new CharacterId(input);
	}
	
	public PrivateChannelInvited(long privateChannelId) {
		this.privateChannelId = new CharacterId(privateChannelId);
	}
	
	public long getPrivateChannelId() {
		return this.privateChannelId.getData();
	}
	
	public int getPacketType() {
		return PrivateChannelInvited.TYPE;
	}

	@Override
	public AbstractType[] getParameters() {
		return new AbstractType[]{privateChannelId};
	}
}
