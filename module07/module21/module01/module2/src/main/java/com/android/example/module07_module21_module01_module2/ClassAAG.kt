package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAB = com.android.example.module07_module21_module01_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAC = com.android.example.module07_module21_module01_module5.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAC = com.android.example.module07_module21_module01_module5.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB,
		param1: com.android.example.module07_module21_module01_module5.ClassAAA,
		param2: com.android.example.module07_module21_module01_module5.ClassAAA,
		param3: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		for (iAb in 0..6) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.isDisposed()

				val local_var_4_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_1.clear()

			}
			param0.method3(io.reactivex.subscribers.TestSubscriber())

		}
		param0.method0(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

	}
}
