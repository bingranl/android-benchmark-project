package com.android.example.module01_module04

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..6) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.android.example.module06_module114.ClassAAG = com.android.example.module06_module114.ClassAAG()
					local_var_5_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

				}
				val local_var_4_0: com.android.example.module06_module287_module3.ClassAAG = com.android.example.module06_module287_module3.ClassAAG()
				local_var_4_0.method1(com.android.example.module06_module090_module3.ClassAAE(), com.android.example.module06_module090_module3.ClassAAC(), com.android.example.module06_module090_module3.ClassAAH(), com.android.example.module06_module090_module3.ClassAAJ())

				local_var_4_0.method1(com.android.example.module06_module090_module3.ClassAAE(), com.android.example.module06_module090_module3.ClassAAC(), com.android.example.module06_module090_module3.ClassAAH(), com.android.example.module06_module090_module3.ClassAAJ())

			}
			val local_var_3_0: com.android.example.module06_module356_module1.ClassAAE = com.android.example.module06_module356_module1.ClassAAE()
			local_var_3_0.method0("SomeString", "SomeString", "SomeString")

		}
		val local_var_2_3: com.android.example.module06_module109_module1.ClassAAC = com.android.example.module06_module109_module1.ClassAAC()
		local_var_2_3.method2("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.onNext(kotlin.Any())

		val local_var_2_4: com.android.example.module06_module130_module3.ClassAAG = com.android.example.module06_module130_module3.ClassAAG()
		local_var_2_4.method3("SomeString", "SomeString")

		val local_var_2_5: com.android.example.module06_module201_module1.ClassAAF = com.android.example.module06_module201_module1.ClassAAF()
		local_var_2_5.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.cancel()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any>
	) {
		param0.dispose()

		param0.cancel()

	}
}
