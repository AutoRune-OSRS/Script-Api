package io.autorune.script.api

import io.autorune.osrs.api.Client
import kotlin.coroutines.coroutineContext

// acquire the API installed on the current coroutine
suspend inline fun client() : Client
{

	val ctx = coroutineContext[ApiContext] ?: error("context not found")

	return ctx.client

}