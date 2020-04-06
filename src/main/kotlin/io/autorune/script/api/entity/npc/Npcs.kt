package io.autorune.script.api.entity.npc

import io.autorune.osrs.api.entity.Npc
import io.autorune.script.api.client
import io.autorune.script.api.entity.player.Players
import java.awt.Point
import java.security.SecureRandom

/**
 * An object to request a(n) list of a(n) [Npc].
 */
object Npcs
{

	/**
	 * Returns a list of [Npc]'s in the current region.
	 */
	suspend fun getNpcs() : List<Npc?>
	{
		return client().npcs.toList()
	}

	suspend fun indexOf(npc: Npc) : Int
	{
		return getNpcs().indexOf(npc)
	}

}