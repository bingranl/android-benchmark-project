package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAF = com.android.example.module07_module21_module01_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAF = com.android.example.module07_module21_module01_module5.ClassAAF()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB
	) {
	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAA,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		for (iAb in 0..0) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

				local_var_4_0.dispose()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertSubscribed()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}
}
