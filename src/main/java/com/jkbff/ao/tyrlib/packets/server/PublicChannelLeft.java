package com.jkbff.ao.tyrlib.packets.server;

import java.io.DataInputStream;
import java.io.IOException;

import sk.sigp.aobot.client.types.AbstractType;
import sk.sigp.aobot.client.types.ChannelId;

public class PublicChannelLeft extends BaseServerPacket {

	public static final int TYPE = 61;

	protected final ChannelId channelId;

	public PublicChannelLeft(DataInputStream input) {
		this.channelId = new ChannelId(input);
	}
	
	public PublicChannelLeft(long channelId) {
		this.channelId = new ChannelId(channelId);
	}

	public long getChannelId() {
		return channelId.getData();
	}

	public int getPacketType() {
		return PublicChannelLeft.TYPE;
	}

	@Override
	public AbstractType[] getParameters() {
		return new AbstractType[]{channelId};
	}
}
