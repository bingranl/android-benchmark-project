package com.android.example.module22_module01_module07_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module22_module01_module07_module1.ClassAAG = com.android.example.module22_module01_module07_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module22_module01_module07_module1.ClassAAC = com.android.example.module22_module01_module07_module1.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module22_module01_module07_module1.ClassAAJ = com.android.example.module22_module01_module07_module1.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module22_module01_module07_module1.ClassAAC = com.android.example.module22_module01_module07_module1.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module22_module01_module07_module3.ClassAAI = com.android.example.module22_module01_module07_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module22_module01_module07_module3.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.requestMore(-3279193539904981008)

		for (iAb in 0..6) {
			for (iAc in 0..0) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.cancel()

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.dispose()

			}
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-3779089947688158217)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}

	fun method1(
		param0: com.android.example.module22_module01_module07_module3.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		param0.method4("SomeString", "SomeString", "SomeString")

		param0.method3("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(383537897663377711)

	}

	fun method2(
		param0: com.android.example.module22_module01_module07_module3.ClassAAB,
		param1: com.android.example.module22_module01_module07_module1.ClassAAE,
		param2: com.android.example.module22_module01_module07_module1.ClassAAF,
		param3: com.android.example.module22_module01_module07_module3.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

	}
}
