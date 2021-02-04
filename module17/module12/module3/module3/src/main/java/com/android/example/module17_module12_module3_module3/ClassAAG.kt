package com.android.example.module17_module12_module3_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(78)
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module17_module01_module3.ClassAAE = com.android.example.module17_module01_module3.ClassAAE()
		local_var_2_2.method0("SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			for (iAb in 0..1) {
				param0.onNext(kotlin.Any())

				param0.cancel()

				param0.onNext(kotlin.Any())

				param0.assertNotSubscribed()

			}
		}
		val local_var_2_3: com.android.example.module17_module01_module3.ClassAAF = com.android.example.module17_module01_module3.ClassAAF()
		local_var_2_3.method0("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module17_module13_module1.ClassAAH = com.android.example.module17_module13_module1.ClassAAH()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
