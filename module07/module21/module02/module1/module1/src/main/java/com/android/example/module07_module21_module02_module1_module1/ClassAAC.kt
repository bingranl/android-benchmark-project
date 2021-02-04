package com.android.example.module07_module21_module02_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAI = com.android.example.module07_module21_module02_module1_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAI = com.android.example.module07_module21_module02_module1_module5.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAC = com.android.example.module07_module21_module02_module1_module5.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module07_module21_module02_module1_module5.ClassAAH = com.android.example.module07_module21_module02_module1_module5.ClassAAH()
	private 	val instance_var_1_4: com.android.example.module07_module21_module02_module1_module5.ClassAAJ = com.android.example.module07_module21_module02_module1_module5.ClassAAJ()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAD,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAC
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onComplete()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onNext(kotlin.Any())

		}
		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.isDisposed()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAE
	) {
		val local_var_2_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_1.triggerActions()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}
}
