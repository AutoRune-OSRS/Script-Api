package io.autorune.script.api.entity.player

import io.autorune.osrs.api.entity.Player
import io.autorune.script.api.client

/**
 * An object to return a(n) list of a(n) [Player].
 */
object Players
{

	/**
	 * Returns the local player.
	 */
	suspend fun getLocalPlayer() : Player
	{
		return client().localPlayer
	}

	/**
	 * Returns a list of [Player]'s in the region.
	 */
	suspend fun getPlayers() : List<Player?>
	{
		return client().players.toList()
	}

}