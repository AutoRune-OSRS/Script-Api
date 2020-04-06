package io.autorune.script.api

import io.autorune.osrs.api.Client
import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext

/**
 * An object defined to be passed through [ThreadLocal] in the [CoroutineContext] for static calls in each tabbed instance.
 */
class ApiContext(val client: Client) : AbstractCoroutineContextElement(ApiContext)
{

	/**
	 * The [Client] instance that is defined on runtime of the current tab. (When the [ClassLoader] is initialized.
	 */

	companion object : CoroutineContext.Key<ApiContext>

}