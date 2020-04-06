package io.autorune.script.api.entity.player.skills

import io.autorune.script.api.client
import kotlin.math.pow

enum class Skills(val skillId: Int)
{
	
	ATTACK(0),

	DEFENCE(1),

	STRENGTH(2),

	HITPOINTS(3),

	RANGED(4),

	PRAYER(5),

	MAGIC(6),

	COOKING(7),

	WOODCUTTING(8),

	FLETCHING(9),

	FISHING(10),

	FIREMAKING(11),

	CRAFTING(12),

	SMITHING(13),

	MINING(14),

	HERBLORE(15),

	AGILITY(16),

	THIEVING(17),

	SLAYER(18),

	FARMING(19),

	RUNECRAFTING(20),

	HUNTER(21),

	CONSTRUCTION(22)

	;

	suspend fun fetchLevel() : Int
	{
		return client().levels[skillId]
	}

	suspend fun fetchBoostedLevel() : Int
	{
		return client().currentLevels[skillId]
	}

	suspend fun fetchExperience() : Int
	{
		return client().experience[skillId]
	}

	suspend fun fetchExperienceUntil(level: Int) : Int
	{
		val currentExperience = fetchExperience()
		return EXPERIENCE_TABLE[level] - currentExperience
	}

	suspend fun fetchExperienceUntilNextLevel() : Int
	{
		val experience = fetchExperience()

		val level = fetchLeveLForExperience(experience)

		return if(experience < MAXIMUM_EXPERIENCE)
		{
			EXPERIENCE_TABLE[level] - experience
		}
		else 0
	}

	companion object
	{

		private const val MAXIMUM_LEVEL = 126

		private const val MAXIMUM_EXPERIENCE = 200000000

		val EXPERIENCE_TABLE = IntArray(MAXIMUM_LEVEL)

		init
		{
			var var0 = 0
			EXPERIENCE_TABLE.indices.forEach { level ->
				val var2 = level + 1
				val var3 = (var2 + 2.0.pow(var2 / 7.0) * 300.0).toInt()
				var0 += var3
				EXPERIENCE_TABLE[level] = var0 / 4
			}
		}

		suspend fun fetchTotalLevel() : Int
		{
			return values().sumBy { client().levels[it.skillId] }
		}

		suspend fun fetchTotalExperience() : Int
		{
			return values().sumBy { client().experience[it.skillId] }
		}

		suspend fun fetchLeveLForExperience(experience : Int) : Int
		{
			var level = 1
			(0 until MAXIMUM_LEVEL)
					.filter { experience >= EXPERIENCE_TABLE[it] }
					.forEach { level = it + 2 }
			return level
		}

	}

}